import 'package:flutter/material.dart';
import 'rrectanglepaintercolor.dart';

class RoundRectTabIndicator extends Decoration {
  final BoxPainter _painter;

  RoundRectTabIndicator(
      {required Color color, required double weight, required double width})
      : _painter = RRectanglePainterColor(color, weight, width);

  @override
  BoxPainter createBoxPainter([VoidCallback? onChanged]) => _painter;
}
