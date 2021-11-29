import 'package:flutter/material.dart';

class RRectanglePainterColor extends BoxPainter {
  final Paint _paint;
  final double weight;
  final double width;

  RRectanglePainterColor(Color color, this.weight, this.width)
      : _paint = Paint()
          ..color = color
          ..isAntiAlias = true;

  @override
  void paint(Canvas canvas, Offset offset, ImageConfiguration cfg) {
    final Offset _offset = offset + Offset(0, cfg.size!.height - weight);

    Rect rect = _offset & Size(width, weight);
    RRect rRect = RRect.fromRectXY(rect, weight, weight);

    canvas.drawRRect(rRect, _paint);
  }
}
