import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor(private http: HttpClient) { }
  login(username: string, password: string) {
    // Envía una petición HTTP al servidor para verificar el usuario y la contraseña
    return this.http.post<boolean>('/api/usuarios', { username, password });
  }
}
