import 'package:cynemas_app/constants.dart';
import 'package:cynemas_app/views/login.dart';
import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Cynemas',
      theme: ThemeData(
        primaryColor: cPrimaryColor,
        scaffoldBackgroundColor: Colors.white
      ),
      home: LoginPage(),
    );
  }
}

