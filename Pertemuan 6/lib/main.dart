import 'package:flutter/material.dart';
import 'hello_world.dart';
import 'column_widget.dart';
import 'row_widget.dart';
import 'ui/produk_form.dart';
import 'ui/produk_page.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      title: 'Aplikasi Flutter Pertama',
      debugShowCheckedModeBanner: false,
      // Ubah target pemanggilan widget sesuai latihan yang ingin dijalankan:
      home: ProdukPage(),
      // home: ProdukForm(),
      // home: RowWidget(),
      // home: ColumnWidget(),
      // home: HelloWorld(),
    );
  }
}