import java.util.Scanner;
public class agrologia_de_cultivos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] cultivos = new String[10];
        String[] tipos = new String[10];
        String[] variedades = new String[10];
        String[] tiposSuelo = new String[10];
        double[] areas = new double[10];
        int[] cantidadesPlantas = new int[10];
        double[] rendimientos = new double[10];
        String[] fechasSiembra = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //------------------------------------------//
        //--|menu_principal_agrologia_de_cultivos|--//
        //------------------------------------------//
        do {
            System.out.println("menu principal agrologia de cultivos");
            System.out.println("1) Registrar cultivo");
            System.out.println("2) Editar cultivo");
            System.out.println("3) Listar cultivos");
            System.out.println("4) Buscar cultivo");
            System.out.println("5) Eliminar cultivo");
            System.out.println("6) Mostrar analisis");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-----------------------//
                //--|registrar_cultivo|--//
                //-----------------------//
                case 1:
                    if (total >= cultivos.length) {
                        System.out.println("No hay espacio para registrar mas cultivos.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro del cultivo");
                    System.out.println("id del cultivo a registrar: " + id);
                    System.out.print("nombre del cultivo: ");
                    cultivos[total] = entrada.nextLine();
                    System.out.print("tipo de cultivo: ");
                    tipos[total] = entrada.nextLine();
                    System.out.print("variedad: ");
                    variedades[total] = entrada.nextLine();
                    System.out.print("tipo de suelo: ");
                    tiposSuelo[total] = entrada.nextLine();
                    System.out.print("area cultivada (hectareas): ");
                    areas[total] = entrada.nextDouble();
                    System.out.print("cantidad de plantas: ");
                    cantidadesPlantas[total] = entrada.nextInt();
                    System.out.print("rendimiento estimado (toneladas/ha): ");
                    rendimientos[total] = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("fecha de siembra: ");
                    fechasSiembra[total] = entrada.nextLine();
                    System.out.print("estado del cultivo: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Cultivo registrado correctamente.");
                    total++;
                    break;
                //--------------------//
                //--|editar_cultivo|--//
                //--------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen cultivos registrados.");
                        break;
                    }
                    System.out.println("Datos de los cultivos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Cultivo: " + cultivos[i] + " | Tipo: " + tipos[i] + " | Variedad: " + variedades[i] + " | Suelo: " + tiposSuelo[i] + " | Area: " + areas[i] + " hectareas | Plantas: " + cantidadesPlantas[i] + " | Rendimiento: " + rendimientos[i] + " toneladas/ha | Siembra: " + fechasSiembra[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del cultivo: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del cultivo");
                        System.out.print("Nuevo nombre del cultivo: ");
                        cultivos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de cultivo: ");
                        tipos[posicion] = entrada.nextLine();
                        System.out.print("Nueva variedad: ");
                        variedades[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de suelo: ");
                        tiposSuelo[posicion] = entrada.nextLine();
                        System.out.print("Nueva area cultivada (hectareas): ");
                        areas[posicion] = entrada.nextDouble();
                        System.out.print("Nueva cantidad de plantas: ");
                        cantidadesPlantas[posicion] = entrada.nextInt();
                        System.out.print("Nuevo rendimiento estimado (toneladas/ha): ");
                        rendimientos[posicion] = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("Nueva fecha de siembra: ");
                        fechasSiembra[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del cultivo: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Cultivo actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|listar_cultivos|--//
                //---------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen cultivos registrados.");
                    } else {
                        System.out.println("Lista de cultivos");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Cultivo: " + cultivos[i] + " | Tipo: " + tipos[i] + " | Variedad: " + variedades[i] + " | Suelo: " + tiposSuelo[i] + " | Area: " + areas[i] + " hectareas | Plantas: " + cantidadesPlantas[i] + " | Rendimiento: " + rendimientos[i] + " toneladas/ha | Siembra: " + fechasSiembra[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //--------------------//
                //--|buscar_cultivo|--//
                //--------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen cultivos registrados.");
                        break;
                    }
                    System.out.println("busqueda de cultivo");
                    System.out.print("ingresa la id para buscar cultivo: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del cultivo encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Cultivo: " + cultivos[posicion] + " | Tipo: " + tipos[posicion] + " | Variedad: " + variedades[posicion] + " | Suelo: " + tiposSuelo[posicion] + " | Area: " + areas[posicion] + " hectareas | Plantas: " + cantidadesPlantas[posicion] + " | Rendimiento: " + rendimientos[posicion] + " toneladas/ha | Siembra: " + fechasSiembra[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|eliminar_cultivo|--//
                //----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen cultivos registrados.");
                        break;
                    }
                    System.out.println("Datos de los cultivos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Cultivo: " + cultivos[i] + " | Tipo: " + tipos[i] + " | Variedad: " + variedades[i] + " | Suelo: " + tiposSuelo[i] + " | Area: " + areas[i] + " hectareas | Plantas: " + cantidadesPlantas[i] + " | Rendimiento: " + rendimientos[i] + " toneladas/ha | Siembra: " + fechasSiembra[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del cultivo a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            cultivos[i] = cultivos[i + 1];
                            tipos[i] = tipos[i + 1];
                            variedades[i] = variedades[i + 1];
                            tiposSuelo[i] = tiposSuelo[i + 1];
                            areas[i] = areas[i + 1];
                            cantidadesPlantas[i] = cantidadesPlantas[i + 1];
                            rendimientos[i] = rendimientos[i + 1];
                            fechasSiembra[i] = fechasSiembra[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Cultivo eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|mostrar_analisis|--//
                //----------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen cultivos registrados.");
                        break;
                    }
                    double areaTotal = 0;
                    int plantasTotales = 0;
                    double rendimientoTotal = 0;
                    double mayorRendimiento = rendimientos[0];
                    int posicionMayor = 0;
                    int enCrecimiento = 0;
                    int cosechados = 0;
                    int otrosEstados = 0;
                    for (int i = 0; i < total; i++) {
                        areaTotal += areas[i];
                        plantasTotales += cantidadesPlantas[i];
                        rendimientoTotal += rendimientos[i];
                        if (rendimientos[i] > mayorRendimiento) {
                            mayorRendimiento = rendimientos[i];
                            posicionMayor = i;
                        }
                        if (estados[i].equalsIgnoreCase("En crecimiento")) {
                            enCrecimiento++;
                        } else if (estados[i].equalsIgnoreCase("Cosechado")) {
                            cosechados++;
                        } else {
                            otrosEstados++;
                        }
                    }
                    double promedioRendimiento = rendimientoTotal / total;
                    System.out.println("resumen de agrologia de cultivos");
                    System.out.println("Cultivos registrados: " + total);
                    System.out.println("Area total cultivada: " + areaTotal + " hectareas");
                    System.out.println("Total de plantas: " + plantasTotales);
                    System.out.println("Rendimiento estimado total: " + rendimientoTotal + " toneladas/ha");
                    System.out.println("Promedio de rendimiento: " + promedioRendimiento + " toneladas/ha");
                    System.out.println("Mayor rendimiento: " + cultivos[posicionMayor] + " - " + mayorRendimiento + " toneladas/ha");
                    System.out.println("En crecimiento: " + enCrecimiento);
                    System.out.println("Cosechados: " + cosechados);
                    System.out.println("Otros estados: " + otrosEstados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Agrologia de Cultivos.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}