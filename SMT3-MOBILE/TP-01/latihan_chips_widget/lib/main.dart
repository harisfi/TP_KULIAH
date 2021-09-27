import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Latihan Chips Widget',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: MyHomePage(title: 'Latihan Chips Widget'),
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
  var genres = [
    'Accoustic',
    'Bass',
    'Classic',
    'Electro',
    'Hip Hop',
    'Pop',
    'Rock'
  ];
  List<bool> selectedList = [];
  List<String> selectedGenres = [];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
        brightness: Brightness.dark,
      ),
      body: Center(
        child: Column(
          children: [
            Text('Select Genre:'),
            Wrap(
              children: [for (int i = 0; i < genres.length; i++) _listChips(i)],
            )
          ],
        ),
      ),
    );
  }

  Widget _listChips(int i) {
    selectedList.add(false);
    return Container(
      margin: EdgeInsets.only(left: 6, right: 6, top: 3, bottom: 3),
      child: FilterChip(
        label: Text(genres[i]),
        selected: selectedList[i],
        onSelected: (bool val) {
          setState(() {
            if (val) {
              selectedGenres.add(genres[i]);
            } else {
              selectedGenres.remove(genres[i]);
            }

            selectedList[i] = val;
            debugPrint("selected genres: $selectedGenres");
          });
        },
      ),
    );
  }
}
