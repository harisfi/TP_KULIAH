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
      home: MyHomePage(title: 'Latihan ExpansionPanel Widget'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key? key, required this.title}) : super(key: key);
  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class Item {
  Item({
    required this.id,
    required this.name,
    required this.desc,
    this.isExpanded = false,
  });

  int id;
  String name;
  String desc;
  bool isExpanded;
}

class _MyHomePageState extends State<MyHomePage> {
  late List<Item> _list;

  @override
  void initState() {
    super.initState();
    setState(() {
      _list = _generateItems();
    });
  }

  List<Item> _generateItems() {
    return List.generate(20, (int idx) {
      return Item(
        id: idx,
        name: 'Item $idx',
        desc: 'Details of item $idx',
      );
    });
  }

  ExpansionPanel _buildExpansionPanel(Item item) {
    return ExpansionPanel(
      isExpanded: item.isExpanded,
      backgroundColor: Colors.lightBlueAccent,
      canTapOnHeader: true,
      headerBuilder: (BuildContext context, bool isExpanded) {
        return Container(
          child: ListTile(
            title: Text(item.name),
            subtitle: Text(item.name),
          ),
        );
      },
      body: ListTile(
        title: Text(item.desc),
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: SingleChildScrollView(
        child: ExpansionPanelList(
          animationDuration: Duration(seconds: 2),
          expandedHeaderPadding: EdgeInsets.all(10),
          dividerColor: Colors.red,
          elevation: 4,
          expansionCallback: (int idx, bool isExpanded) {
            setState(() {
              _list[idx].isExpanded = !isExpanded;
            });
          },
          children: _list.map((e) => _buildExpansionPanel(e)).toList(),
        ),
      ),
    );
  }
}
