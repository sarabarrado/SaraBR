import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { MatTableDataSource } from '@angular/material/table';
import { Autores } from 'src/models/autores';

@Component({
  selector: 'app-autores',
  templateUrl: './autores.component.html',
  styleUrls: ['./autores.component.css']
})
export class AutoresComponent implements OnInit {
  data: any;
  displayedColumns: string[] = ['Nombre', 'Fecha Nacimiento'];
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.getAutores();
  }
  public listaAutores: Autores[] = []; 
  public dataSourceAutores = new MatTableDataSource();
  getAutores() {
    this.http.get<any[]>('http://localhost:8082/api/autores').subscribe(
      response => {
        this.dataSourceAutores.data = response;
        console.log("lo que devuelve de autores: " + this.dataSourceAutores.data);
        
        // procesar la respuesta de la API
      },
    );
}
}
