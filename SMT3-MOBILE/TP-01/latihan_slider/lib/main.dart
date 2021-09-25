import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  double _val = 1;

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          backgroundColor: Colors.green,
          title: Text('Latihan Slider'),
        ),
        body: Container(
          height: 100,
          child: Slider(
            value: _val,
            onChanged: (val) {
              setState(() {
                _val = val;
              });
            },
          ),
        ),
      ),
    );
  }
}
