void getData() async {
  // Future.delayed is used to delay running a code, simulates network requests
  // We're pretending to get the 'character' String from the internet with 3 second delay
  String character = await Future.delayed(Duration(seconds: 3), () {
    return 'Yor forger';
  });

  // We cannot get the 'role' of the 'character' if we haven't got the 'character' yet
  // So we use 'await' to NOT run the next line of code UNTIL this code is finished
  String role = await Future.delayed(Duration(seconds: 2), () {
    return '$character is an assassin';
  });

  // Now we print the 'character' and 'role' that we pretended to get from the internet
  print('$character: - $role');
}

// Response response = await get(Uri.parse('https://jsonplaceholder.typicode.com/todos/1'));
// Map data = jsonDecode(response.body);
// print(data);
// print(data['title']);