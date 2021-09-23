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
          title: Text('Latihan SingleChildScrollView Widget'),
        ),
        body: Center(
          child: Column(
            children: [
              Container(
                height: 150,
                width: double.infinity,
                color: Colors.red,
              ),
              Container(
                height: 150,
                width: double.infinity,
                color: Colors.yellow,
              ),
              Container(
                height: 150,
                width: double.infinity,
                color: Colors.green,
              ),
              Container(
                height: 150,
                width: double.infinity,
                color: Colors.brown,
              ),
              Container(
                height: 150,
                width: double.infinity,
                color: Colors.blueAccent,
              ),
            ],
          ),
        ),
      ),
    );
  }
}
