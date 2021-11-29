import 'package:cynemas_app/constants.dart';
import 'package:cynemas_app/utils/auth.dart';
import 'package:cynemas_app/views/home.dart';
import 'package:cynemas_app/views/login.dart';
import 'package:flutter/material.dart';
import 'package:flutter_dotenv/flutter_dotenv.dart';
import 'package:shared_preferences/shared_preferences.dart';

Future main() async {
  await dotenv.load(fileName: ".env");
  runApp(MyApp());
}

class MyApp extends StatefulWidget {
  @override
  State<MyApp> createState() => MyAppState();
}

class MyAppState extends State<MyApp> {
  bool? loggedIn;

  @override
  void initState() {
    super.initState();
    setState(() {
      getUsername().then((value) {
        loggedIn = (value != null);
      });
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Cynemas',
      theme: ThemeData(
          primaryColor: cPrimaryColor, scaffoldBackgroundColor: Colors.white),
      home: loggedIn != null ? HomePage() : LoginPage(),
    );
  }
}
