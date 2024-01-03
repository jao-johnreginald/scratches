void main() {
  User user = User('Rainier', 14);
  print(user.name);
  print(user.age);
  user.login();

  SuperUser superuser = SuperUser('Reginald', 17);
  superuser.publish();
  superuser.login();
}

class User {

  String name;
  int age;

  User(this.name, this.age);

  void login() {
    print('$name logged in');
  }

}

class SuperUser extends User {

  SuperUser(String name, int age) : super(name, age);

  void publish() {
    print(name);
    print (age);
    print ('published update');
  }

}