import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatefulWidget {
  MyApp({Key? key}) : super(key: key);

  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Latihan Menyisipkan Gambar'),
        ),
        body: SafeArea(
          child: Image(
            image: AssetImage('assets/images/question.png'),
            height: 200,
          ),
        ),
      ),
    );
  }
}
