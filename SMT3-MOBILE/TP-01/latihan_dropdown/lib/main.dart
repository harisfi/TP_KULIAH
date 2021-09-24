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
  String selectedPerson = 'Joni';
  final listNama = ['Joni', 'Joko', 'Achmad'];

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Latihan Dropdown'),
        ),
        body: Column(
          children: <Widget>[
            Container(
              margin: EdgeInsets.all(20),
              child: DropdownButton(
                value: selectedPerson,
                isExpanded: true,
                items: listNama.map((String item) {
                  return DropdownMenuItem(
                    value: item,
                    child: Text(item),
                  );
                }).toList(),
                onChanged: (String? item) {
                  setState(() {
                    selectedPerson = item!;
                  });
                },
              ),
            ),
            Text(
              selectedPerson,
              style: TextStyle(
                fontSize: 18,
                fontWeight: FontWeight.bold,
              ),
            ),
          ],
        ),
      ),
    );
  }
}
