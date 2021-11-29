import 'dart:convert' as convert;
import 'package:cynemas_app/models/movie.dart';
import 'package:http/http.dart' as http;
import 'package:flutter_dotenv/flutter_dotenv.dart';

Future<Movie> getMovies() async {
  try {
    final response = await http.get(Uri.parse(
        'http://www.omdbapi.com/?apikey=${dotenv.get('OMDB_KEY')}&s=star+wars'));

    return Movie.fromJson(convert.jsonDecode(response.body));
  } catch (e) {
    throw e;
  }
}
