package com.tecsup.lab12.DTO;

public class formularioDTO {


    private String nombre;
    private String apellido;
    private String sexo;
    private int edad;
    private String clave;
    private String correo;
    private OpcionesSexo[] opcionesSexo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public OpcionesSexo[] getOpcionesSexo() {
        return opcionesSexo;
    }

    public void setOpcionesSexo(OpcionesSexo[] opcionesSexo) {
        this.opcionesSexo = opcionesSexo;
    }

    public formularioDTO() {
    }
}
