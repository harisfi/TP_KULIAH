import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Create a Checkbox',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: MyHomePage(
        title: 'Create a Checkbox',
        key: null,
      ),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({required key, required this.title});
  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  bool _checked = false;
  bool _listTileChacked = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: Center(
        child: Column(
          children: [
            Row(
              children: [
                Checkbox(
                  value: _checked,
                  onChanged: (val) {
                    setState(() {
                      _checked = !_checked;
                    });
                  },
                ),
                Text('I am true now')
              ],
            ),
            CheckboxListTile(
              controlAffinity: ListTileControlAffinity.leading,
              title: Text('I am true now'),
              value: _listTileChacked,
              onChanged: (val) {
                setState(() {
                  _listTileChacked = !_listTileChacked;
                });
              },
            )
          ],
        ),
      ),
    );
  }
}
