import 'package:flutter/material.dart';
import 'package:english_words/english_words.dart' as english_words;

class FormValidationDemo extends StatefulWidget {
  const FormValidationDemo({Key? key}) : super(key: key);

  @override
  _FormValidationDemoState createState() => _FormValidationDemoState();
}

class _FormValidationDemoState extends State<FormValidationDemo> {
  final _formKey = GlobalKey<FormState>();
  String adjective = '';
  String noun = '';
  bool agreedToTerms = false;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('📖 Story Generator'),
        actions: [
          Padding(
            padding: const EdgeInsets.all(8),
            child: TextButton(
              style: TextButton.styleFrom(primary: Colors.white),
              child: const Text('Submit'),
              onPressed: () {
                var valid = _formKey.currentState?.validate();
                if (!valid!) {
                  return;
                }

                showDialog<void>(
                  context: context,
                  builder: (context) => AlertDialog(
                    title: const Text('Your story'),
                    content: Text('The $adjective developer saw a $noun'),
                    actions: [
                      TextButton(
                        child: const Text('Done'),
                        onPressed: () {
                          Navigator.of(context).pop();
                        },
                      ),
                    ],
                  ),
                );
              },
            ),
          ),
        ],
      ),
      body: Form(
        key: _formKey,
        child: Scrollbar(
          child: SingleChildScrollView(
            padding: const EdgeInsets.all(16),
            child: Column(
              children: [
                TextFormField(
                  autofocus: true,
                  textInputAction: TextInputAction.next,
                  validator: (value) {
                    if (value!.isEmpty) {
                      return 'Please enter an adjective.';
                    }
                    if (english_words.adjectives.contains(value)) {
                      return null;
                    }
                    return 'Not a valid adjective.';
                  },
                  decoration: const InputDecoration(
                    filled: true,
                    hintText: 'e.g. quick, beautiful, interesting',
                    labelText: 'Enter an adjective',
                  ),
                  onChanged: (value) {
                    adjective = value;
                  },
                ),
                const SizedBox(
                  height: 24,
                ),
                TextFormField(
                  validator: (value) {
                    if (value!.isEmpty) {
                      return 'Please enter a noun.';
                    }
                    if (english_words.nouns.contains(value)) {
                      return null;
                    }
                    return 'Not a valid noun.';
                  },
                  decoration: const InputDecoration(
                    filled: true,
                    hintText: 'i.e. a person, place or thing',
                    labelText: 'Enter a noun',
                  ),
                  onChanged: (value) {
                    noun = value;
                  },
                ),
                const SizedBox(
                  height: 24,
                ),
                FormField<bool>(
                  initialValue: false,
                  validator: (value) {
                    if (value == false) {
                      return 'You must agree to the terms of service.';
                    }
                    return null;
                  },
                  builder: (formFieldState) {
                    return Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Row(
                          children: [
                            Checkbox(
                              value: agreedToTerms,
                              onChanged: (value) {
                                formFieldState.didChange(value);
                                setState(() {
                                  agreedToTerms = value!;
                                });
                              },
                            ),
                            Text(
                              'I agree to the terms of service.',
                              style: Theme.of(context).textTheme.subtitle1,
                            ),
                          ],
                        ),
                        if (!formFieldState.isValid)
                          Text(
                            formFieldState.errorText ?? "",
                            style: Theme.of(context)
                                .textTheme
                                .caption
                                !.copyWith(color: Theme.of(context).errorColor),
                          ),
                      ],
                    );
                  },
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
