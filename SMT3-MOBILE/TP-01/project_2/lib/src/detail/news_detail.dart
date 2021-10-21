import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:project_2/src/home/news_model.dart';

class NewsDetail extends StatefulWidget {
  NewsDetail({Key? key, required this.news}) : super(key: key);

  final News news;

  @override
  _NewsDetailState createState() => _NewsDetailState();
}

class _NewsDetailState extends State<NewsDetail> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          backgroundColor: Colors.transparent,
          elevation: 0.0,
          leading: GestureDetector(
              onTap: () => Navigator.pop(context),
              child: Icon(
                Icons.close,
                color: Colors.grey,
              )),
        ),
        body: Card(
            elevation: 2,
            child: Padding(
                padding: const EdgeInsets.all(12.0),
                child: Column(
                  children: [
                    widget.news.urlToImage == null
                        ? Container()
                        : Image.network(widget.news.urlToImage),
                    SizedBox(
                      height: 10,
                    ),
                    Text(
                      widget.news.title,
                      style: GoogleFonts.lato(
                          fontSize: 21, fontWeight: FontWeight.bold),
                    ),
                    SizedBox(
                      height: 8,
                    ),
                    Row(
                      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                      children: [
                        Row(
                          children: [
                            Icon(
                              Icons.radio,
                              size: 20,
                              color: Colors.grey.shade500,
                            ),
                            SizedBox(
                              width: 8,
                            ),
                            Text(
                              widget.news.name,
                              style: GoogleFonts.lato(
                                  fontSize: 12,
                                  fontWeight: FontWeight.bold,
                                  fontStyle: FontStyle.italic),
                              maxLines: 2,
                            ),
                          ],
                        ),
                        SizedBox(
                          width: 10,
                        ),
                        Row(
                          children: [
                            Icon(
                              Icons.calendar_today,
                              color: Colors.grey.shade500,
                              size: 20,
                            ),
                            SizedBox(
                              width: 8,
                            ),
                            Text(
                              widget.news.publishedAt.split("T")[0],
                              style: GoogleFonts.lato(
                                  fontSize: 12, fontStyle: FontStyle.italic),
                              maxLines: 2,
                            )
                          ],
                        )
                      ],
                    ),
                    SizedBox(
                      height: 10,
                    ),
                    widget.news.description != null
                        ? Text(widget.news.description,
                            style: GoogleFonts.lato(
                                fontSize: 16, fontStyle: FontStyle.normal))
                        : Container(),
                  ],
                ))));
  }
}
