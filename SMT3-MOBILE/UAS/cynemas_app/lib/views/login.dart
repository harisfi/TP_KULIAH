import 'package:cynemas_app/components/textfieldcontainer.dart';
import 'package:cynemas_app/constants.dart';
import 'package:cynemas_app/controllers/login.dart';
import 'package:flutter/material.dart';
import 'package:flutter_svg/svg.dart';
import 'package:google_fonts/google_fonts.dart';

class LoginPage extends StatefulWidget {
  @override
  _LoginPageState createState() => _LoginPageState();
}

class _LoginPageState extends State<LoginPage> {
  final unameController = TextEditingController();
  final passController = TextEditingController();
  final snackBar = SnackBar(content: Text("Username atau password salah"));
  late bool loadingState;

  @override
  void initState() {
    loadingState = false;
    super.initState();
  }

  void setLoadingState(bool state) {
    setState(() {
      loadingState = state;
    });
  }

  void _login(BuildContext context) {
    setLoadingState(true);
    Future<bool> loginReq = login(unameController.text, passController.text);
    loginReq.then((value) {
          if (value) {
            print(1);
          } else {
            ScaffoldMessenger.of(context).showSnackBar(snackBar);
          }
          setLoadingState(false);
        });
  }

  @override
  Widget build(BuildContext context) {
    Size size = MediaQuery.of(context).size;
    return Scaffold(
      body: SafeArea(
          child: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Text(
              'Cynemas',
              style: GoogleFonts.poppins(
                  color: cPrimaryColor,
                  fontSize: 24,
                  fontWeight: FontWeight.bold),
            ),
            Text(
              'Login to continue',
              style: GoogleFonts.poppins(color: cPrimaryColor),
            ),
            SvgPicture.asset('images/home_cinema.svg',
                height: size.height * 0.4),
            TextFieldContainer(
              child: TextField(
                decoration: InputDecoration(
                    icon: Icon(Icons.person, color: cPrimaryColor),
                    hintText: "Masukkan Username",
                    border: InputBorder.none),
                controller: unameController,
              ),
            ),
            TextFieldContainer(
              child: TextField(
                obscureText: true,
                decoration: InputDecoration(
                    icon: Icon(Icons.lock, color: cPrimaryColor),
                    hintText: "Masukkan Password",
                    border: InputBorder.none),
                controller: passController,
              ),
            ),
            Container(
              width: size.width * 0.6,
              margin: EdgeInsets.only(top: 10),
              child: ClipRRect(
                borderRadius: BorderRadius.circular(30),
                child: TextButton(
                  style: TextButton.styleFrom(
                      backgroundColor:
                          loadingState ? Colors.grey : cPrimaryColor,
                      padding:
                          EdgeInsets.symmetric(vertical: 20, horizontal: 40)),
                  onPressed: loadingState ? null : () => _login(context),
                  child: Text(
                    "LOGIN",
                    style: TextStyle(
                        color: loadingState ? Colors.black : Colors.white),
                  ),
                ),
              ),
            ),
          ],
        ),
      )),
    );
  }
}
