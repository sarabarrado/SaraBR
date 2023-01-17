import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { Libros } from 'src/models/libros';

@Component({
  selector: 'app-libros',
  templateUrl: './libros.component.html',
  styleUrls: ['./libros.component.css']
})
export class LibrosComponent implements OnInit {
  data: any;
  displayedColumns: string[] = ['titulo', 'precio', 'genero', 'año'];
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
  }
  public listaLibros: Libros[] = []; 
  public dataSourceLibros = new MatTableDataSource();
  makeApiRequest() {
    this.http.get<any[]>('http://localhost:8082/api/libros').subscribe(
      response => {
        this.dataSourceLibros.data = response;
        console.log("lo que devuelve de usuarios: " + this.dataSourceLibros.data);
        
        // procesar la respuesta de la API
      },
    );
}

}
