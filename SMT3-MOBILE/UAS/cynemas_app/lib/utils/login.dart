import 'dart:convert' as convert;
import 'package:http/http.dart' as http;

Future<bool> login(String username, String pass) async {
  try {
    final response = await http.post(
      Uri.parse('https://cynemas-backend.herokuapp.com/auth/local'),
      headers: <String, String>{
        'Content-Type': 'application/json; charset=UTF-8',
      },
      body: convert.jsonEncode(
          <String, String>{'identifier': username, 'password': pass}),
    );

    return (response.statusCode == 200);
  } catch (e) {
    return false;
  }
}
