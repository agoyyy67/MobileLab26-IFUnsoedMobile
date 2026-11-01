import 'package:flutter/material.dart';

class ProdukPage extends StatefulWidget {
  const ProdukPage({Key? key}) : super(key: key);

  @override
  ProdukPageState createState() => ProdukPageState();
}

class ProdukPageState extends State<ProdukPage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('List Data Produk'),
      ),
      body: ListView(
        children: const [
          Card(
            child: ListTile(
              title: Text('Kulkas'),
              subtitle: Text('30000'),
            ),
          ),
          Card(
            child: ListTile(
              title: Text('Playstation'),
              subtitle: Text('30000'),
            ),
          ),
          Card(
            child: ListTile(
              title: Text('Radio'),
              subtitle: Text('30000'),
            ),
          ),
        ],
      ),
    );
  }
}