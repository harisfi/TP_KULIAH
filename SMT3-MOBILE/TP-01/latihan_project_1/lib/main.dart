import 'package:flutter/material.dart';
// import 'package:http/http.dart' as http;

import 'src/form_widgets.dart';
import 'src/validation.dart';

void main() {
  runApp(const FormApp());
}

final demos = [
  Demo(
    name: 'Form widgets',
    route: '/form_widgets',
    builder: (context) => const FormWidgetsDemo(),
  ),
  Demo(
    name: 'Validation',
    route: '/validation',
    builder: (context) => const FormValidationDemo(),
  ),
];

class FormApp extends StatelessWidget {
  const FormApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Form Samples',
      theme: ThemeData(primarySwatch: Colors.teal),
      routes: Map.fromEntries(demos.map((d) => MapEntry(d.route, d.builder))),
      home: const HomePage(),
    );
  }
}

class HomePage extends StatelessWidget {
  const HomePage({Key? key}) : super(key: key);
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Form Samples'),
      ),
      body: ListView(
        children: [...demos.map((d) => DemoTile(demo: d))],
      ),
    );
  }
}

class DemoTile extends StatelessWidget {
  final Demo demo;

  const DemoTile({required this.demo, Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return ListTile(
      title: Text(demo.name),
      onTap: () {
        Navigator.pushNamed(context, demo.route);
      },
    );
  }
}

class Demo {
  final String name;
  final String route;
  final WidgetBuilder builder;

  const Demo({required this.name, required this.route, required this.builder});
}
