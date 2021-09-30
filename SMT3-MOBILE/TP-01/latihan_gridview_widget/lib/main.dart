import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Latihan Flutter',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: MyHomePage(title: 'Latihan GridView Widget'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key? key, required this.title}) : super(key: key);
  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
        backgroundColor: Colors.green,
      ),
      body: Center(
        child: GridView.extent(
          primary: false,
          padding: EdgeInsets.all(20),
          crossAxisSpacing: 16,
          mainAxisSpacing: 10,
          maxCrossAxisExtent: 200,
          children: <Widget>[
            Container(
              padding: EdgeInsets.all(8),
              child: Text(
                'First',
                style: TextStyle(fontSize: 20),
              ),
              color: Colors.yellow,
            ),
            Container(
              padding: EdgeInsets.all(8),
              child: Text(
                'Second',
                style: TextStyle(fontSize: 20),
              ),
              color: Colors.blue,
            ),
            Container(
              padding: EdgeInsets.all(8),
              child: Text(
                'Third',
                style: TextStyle(fontSize: 20),
              ),
              color: Colors.blue,
            ),
            Container(
              padding: EdgeInsets.all(8),
              child: Text(
                'Fourth',
                style: TextStyle(fontSize: 20),
              ),
              color: Colors.yellow,
            ),
            Container(
              padding: EdgeInsets.all(8),
              child: Text(
                'Fifth',
                style: TextStyle(fontSize: 20),
              ),
              color: Colors.yellow,
            ),
            Container(
              padding: EdgeInsets.all(8),
              child: Text(
                'Sixth',
                style: TextStyle(fontSize: 20),
              ),
              color: Colors.blue,
            ),
          ],
        ),
      ),
    );
  }
}
