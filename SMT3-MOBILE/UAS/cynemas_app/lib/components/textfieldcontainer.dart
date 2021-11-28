import 'package:cynemas_app/constants.dart';
import 'package:flutter/material.dart';

class TextFieldContainer extends StatelessWidget {
  final Widget child;

  const TextFieldContainer({Key? key, required this.child}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    Size size = MediaQuery.of(context).size;
    return Container(
      margin: EdgeInsets.symmetric(vertical: 5),
      padding: EdgeInsets.symmetric(horizontal: 20),
      width: size.width * 0.6,
      decoration: BoxDecoration(
          color: cPrimaryLight, borderRadius: BorderRadius.circular(30)),
      child: child,
    );
  }
}