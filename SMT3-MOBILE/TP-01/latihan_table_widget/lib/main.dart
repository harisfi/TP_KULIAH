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
      home: MyHomePage(title: 'Latihan Table Widget'),
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
  var list = {
    {'icon': 'account_box', 'text': 'My Account'},
    {'icon': 'settings', 'text': 'Settings'},
    {'icon': 'lightbulb_outline', 'text': 'Ideas'},
    {'icon': 'cake', 'text': 'Cake'},
    {'icon': 'voice_chat', 'text': 'Voice Chat'},
    {'icon': 'add_location', 'text': 'Add Location'},
  };

  List<Widget> widgets = [];

  _MyHomePageState() {
    list.forEach((e) {
      widgets.add(Column(
        children: [
          Text(
            e['icon']!,
            style: TextStyle(
              fontFamily: 'MaterialIcons',
              fontSize: 48,
            ),
          ),
          Text(e['text']!)],
      ));
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Center(
        child: Column(
          children: <Widget>[
            Container(
              margin: EdgeInsets.all(10),
              child: Table(
                border: TableBorder.all(),
                children: [
                  TableRow(
                    children: widgets.sublist(0, 3),
                  ),
                  TableRow(
                    children: widgets.sublist(3, 6),
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}
