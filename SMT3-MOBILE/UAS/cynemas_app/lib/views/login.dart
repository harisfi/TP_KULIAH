import 'package:cynemas_app/components/textfieldcontainer.dart';
import 'package:cynemas_app/constants.dart';
import 'package:cynemas_app/utils/auth.dart';
import 'package:cynemas_app/views/home.dart';
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
        setUsername(unameController.text);
        Navigator.push(
            context, MaterialPageRoute(builder: (context) => HomePage()));
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
              style: GoogleFonts.greatVibes(
                  color: cPrimaryColor,
                  fontSize: 52,
                  fontWeight: FontWeight.bold),
            ),
            Text(
              'Login to continue',
              style: GoogleFonts.poppins(color: cPrimaryColor),
            ),
            SizedBox(height: 30),
            SvgPicture.asset('images/home_cinema.svg',
                height: size.height * 0.35),
            SizedBox(height: 25),
            TextFieldContainer(
              child: TextField(
                decoration: InputDecoration(
                    icon: Icon(Icons.person, color: cPrimaryColor),
                    hintText: "Masukkan Username",
                    border: InputBorder.none),
                controller: unameController,
                style: GoogleFonts.poppins(),
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
                style: GoogleFonts.poppins(),
              ),
            ),
            Container(
              width: size.width * 0.6,
              margin: EdgeInsets.only(top: 20),
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
                    loadingState ? "Loading..." : "Login",
                    style: GoogleFonts.poppins(
                      color: loadingState ? Colors.black : Colors.white
                    ),
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
