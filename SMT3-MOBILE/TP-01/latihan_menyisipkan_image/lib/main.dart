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
          title: Text('Latihan Menyisipkan Image'),
        ),
        body: SafeArea(
          child: Container(
            margin: EdgeInsets.only(left: 45, top: 0, right: 0, bottom: 0),
            padding: EdgeInsets.only(left: 0, top: 50, right: 0, bottom: 0),
            child: Column(
              children: <Widget>[
                Image(
                  image: AssetImage('assets/images/question.png'),
                  height: 200,
                ),
                Text('Selamat Datang'),
                Text('di Aplikasi Mobile Kami')
              ],
            ),
          ),
        ),
      ),
    );
  }
}
