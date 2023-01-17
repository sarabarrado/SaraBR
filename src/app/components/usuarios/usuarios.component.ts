import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { Usuarios } from 'src/models/usuarios';

@Component({
  selector: 'app-usuarios',
  templateUrl: './usuarios.component.html',
  styleUrls: ['./usuarios.component.css']
})
export class UsuariosComponent implements OnInit {

  displayedColumns: string[] = ['Nombre', 'E-mail'];
  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.getUsuarios();
  }
  public listaUsuarios: Usuarios[] = []; 
  public dataSourceUsuarios = new MatTableDataSource();
  getUsuarios() {
    this.http.get<any[]>('http://localhost:8082/api/usuarios').subscribe(
      response => {
        this.dataSourceUsuarios.data = response;
        console.log("lo que devuelve de usuarios: " + this.dataSourceUsuarios.data);
        
        // procesar la respuesta de la API
      },
    );
}

}
