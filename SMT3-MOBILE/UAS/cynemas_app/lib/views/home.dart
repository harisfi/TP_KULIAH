import 'package:cynemas_app/constants.dart';
import 'package:cynemas_app/utils/home.dart';
import 'package:cynemas_app/models/movie.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:cynemas_app/components/roundrecttabindicator.dart';

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  late Future<Movie> movieList;

  @override
  void initState() {
    super.initState();
    movieList = getMovies();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        body: FutureBuilder<Movie>(
      future: movieList,
      builder: (context, snapshot) {
        if (snapshot.hasData) {
          return Container(
            child: ListView(
              physics: BouncingScrollPhysics(),
              children: <Widget>[
                Padding(
                  padding: EdgeInsets.only(left: 25, right: 25, top: 25),
                  child: Row(
                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                    children: <Widget>[
                      Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: <Widget>[
                          Text("Hi, Haris",
                              style: GoogleFonts.openSans(
                                  fontSize: 14,
                                  fontWeight: FontWeight.w600,
                                  color: Colors.grey)),
                          Text("Discover Movies",
                              style: GoogleFonts.openSans(
                                  fontSize: 22,
                                  fontWeight: FontWeight.w600,
                                  color: Colors.black)),
                        ],
                      ),
                      IconButton(onPressed: () {}, icon: Icon(Icons.logout))
                    ],
                  ),
                ),
                Container(
                  height: 40,
                  margin: EdgeInsets.only(left: 25, right: 25, top: 18),
                  decoration: BoxDecoration(
                      borderRadius: BorderRadius.circular(10),
                      color: cPrimaryLight),
                  child: Stack(
                    children: <Widget>[
                      TextField(
                        maxLengthEnforcement: MaxLengthEnforcement.enforced,
                        style: GoogleFonts.openSans(
                            fontSize: 12,
                            color: Colors.black,
                            fontWeight: FontWeight.w600),
                        decoration: InputDecoration(
                            contentPadding:
                                EdgeInsets.only(left: 19, right: 50, bottom: 8),
                            border: InputBorder.none,
                            hintText: "Search movie...",
                            hintStyle: GoogleFonts.openSans(
                                fontSize: 12,
                                color: Colors.grey,
                                fontWeight: FontWeight.w600)),
                      ),
                      Positioned(
                        top: 8,
                        right: 9,
                        child: Icon(Icons.search),
                      )
                    ],
                  ),
                ),
                Container(
                  height: 25,
                  margin: EdgeInsets.only(top: 30),
                  padding: EdgeInsets.only(left: 25),
                  child: DefaultTabController(
                      length: 3,
                      child: TabBar(
                          labelPadding: EdgeInsets.all(0),
                          indicatorPadding: EdgeInsets.all(0),
                          isScrollable: true,
                          labelColor: Colors.black,
                          labelStyle: GoogleFonts.openSans(
                              fontSize: 14, fontWeight: FontWeight.w700),
                          unselectedLabelStyle: GoogleFonts.openSans(
                              fontSize: 14, fontWeight: FontWeight.w600),
                          indicator: RoundRectTabIndicator(
                              color: Colors.black, weight: 2, width: 10),
                          tabs: [
                            Tab(
                              child: Container(
                                margin: EdgeInsets.only(right: 25),
                                child: Text("New"),
                              ),
                            ),
                            Tab(
                              child: Container(
                                margin: EdgeInsets.only(right: 25),
                                child: Text("Trending"),
                              ),
                            ),
                            Tab(
                              child: Container(
                                margin: EdgeInsets.only(right: 25),
                                child: Text("Upcoming"),
                              ),
                            ),
                          ])),
                ),
                Container(
                  margin: EdgeInsets.only(top: 21),
                  height: 210,
                  child: ListView.builder(
                      padding: EdgeInsets.only(left: 25, right: 6),
                      itemCount: snapshot.data!.search.length,
                      physics: BouncingScrollPhysics(),
                      scrollDirection: Axis.horizontal,
                      itemBuilder: (context, index) {
                        return Container(
                          margin: EdgeInsets.only(right: 19),
                          height: 210,
                          width: 153,
                          decoration: BoxDecoration(
                              borderRadius: BorderRadius.circular(10),
                              color: cPrimaryColor,
                              image: DecorationImage(
                                  image: NetworkImage(
                                      snapshot.data!.search[index].poster),
                                  fit: BoxFit.cover)),
                        );
                      }),
                ),
                Padding(
                  padding: EdgeInsets.only(left: 25, top: 25),
                  child: Text("Popular",
                      style: GoogleFonts.openSans(
                          fontSize: 20,
                          fontWeight: FontWeight.w600,
                          color: Colors.black)),
                ),
                ListView.builder(
                    padding: EdgeInsets.only(top: 25, left: 25, right: 25),
                    physics: BouncingScrollPhysics(),
                    shrinkWrap: true,
                    itemCount: snapshot.data!.search.length,
                    itemBuilder: (context, index) {
                      return GestureDetector(
                        onTap: () {
                          print(1);
                        },
                        child: Container(
                          margin: EdgeInsets.only(bottom: 19),
                          height: 81,
                          width: MediaQuery.of(context).size.width - 50,
                          child: Row(
                            children: <Widget>[
                              Container(
                                height: 81,
                                width: 62,
                                decoration: BoxDecoration(
                                    borderRadius: BorderRadius.circular(5),
                                    color: cPrimaryColor,
                                    image: DecorationImage(
                                        image: NetworkImage(
                                            snapshot.data!.search[index].poster),
                                        fit: BoxFit.cover)),
                              ),
                              SizedBox(width: 21),
                              Column(
                                mainAxisAlignment: MainAxisAlignment.center,
                                crossAxisAlignment: CrossAxisAlignment.start,
                                children: <Widget>[
                                  Text(
                                    snapshot.data!.search[index].title,
                                    style: GoogleFonts.openSans(
                                        fontSize: 14,
                                        fontWeight: FontWeight.w600,
                                        color: Colors.black),
                                  ),
                                  SizedBox(height: 5),
                                  Text(
                                    snapshot.data!.search[index].year,
                                    style: GoogleFonts.openSans(
                                        fontSize: 12,
                                        fontWeight: FontWeight.w400,
                                        color: Colors.black),
                                  )
                                ],
                              )
                            ],
                          ),
                        ),
                      );
                    })
              ],
            ),
          );
        } else if (snapshot.hasError) {
          return Center(
            child: Text('${snapshot.error}'),
          );
        }
        return Center(
          child: CircularProgressIndicator(),
        );
      },
    ));
  }
}
