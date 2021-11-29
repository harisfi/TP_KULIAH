class Movie {
  final List<Search> search;
  final String totalResults;
  final String response;

  Movie(
      {required this.search,
      required this.totalResults,
      required this.response});

  factory Movie.fromJson(Map<String, dynamic> json) {
    List<Search> _search = [];

    json['Search'].forEach((v) {
      _search.add(new Search.fromJson(v));
    });

    return Movie(
        search: _search,
        totalResults: json['totalResults'],
        response: json['Response']);
  }
}

class Search {
  final String title;
  final String year;
  final String imdbID;
  final String type;
  final String poster;

  Search(
      {required this.title,
      required this.year,
      required this.imdbID,
      required this.type,
      required this.poster});

  factory Search.fromJson(Map<String, dynamic> json) {
    return Search(
      title: json['Title'],
      year: json['Year'],
      imdbID: json['imdbID'],
      type: json['Type'],
      poster: json['Poster'],
    );
  }
}
