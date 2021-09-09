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
          title: Text('Latihan Text Widget'),
        ),
        body: Center(
          child: Container(
            color: Colors.lightBlue,
            width: 150,
            height: 100,
            child: Text(
              'Saya Sedang Berlatih Flutter',
              style: TextStyle(
                color: Colors.white,
                fontStyle: FontStyle.italic,
                fontWeight: FontWeight.w700,
                fontSize: 20
              ),
            ),
          ),
        ),
      ),
    );
  }
}
