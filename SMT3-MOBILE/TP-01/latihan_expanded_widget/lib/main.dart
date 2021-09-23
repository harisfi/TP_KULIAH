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
          title: Text('Latihan Expanded Widget'),
        ),
        body: Center(
          child: Column(
            children: [
              Container(
                color: Colors.blue,
                height: 150,
                width: double.infinity,
              ),
              Expanded(
                child: Container(
                  color: Colors.red,
                  width: double.infinity,
                ),
              ),
              Container(
                color: Colors.blue,
                height: 150,
                width: double.infinity,
              ),
            ],
          ),
        ),
      ),
    );
  }
}
