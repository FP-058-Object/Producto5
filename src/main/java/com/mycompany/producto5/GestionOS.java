package com.mycompany.producto5;

import com.mycompany.producto5.Modelo.Articulo;
import com.mycompany.producto5.Modelo.Cliente;
import com.mycompany.producto5.Modelo.Controlador;
import com.mycompany.producto5.Modelo.Pedido;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class GestionOS {
     Controlador control= new Controlador();
     Scanner teclado = new Scanner(System.in, "UTF-8");

public void inicio(){
        boolean salir = false;
        char opcio;
        do {
            System.out.println("1. Gestión Articulos");
            System.out.println("2. Gestión Clientes");
            System.out.println("3. Gestión Pedidos");
            System.out.println("0. Salir");
            opcio = pedirOpcion();
                switch (opcio) {
                case '1':
                gestionArticulosMenu();
                break;
                case '2':
                gestionClientesMenu();
                break;
                case '3':
                gestionPedidosMenu();
                break;
                case '0':
                salir = true;
                    }
                } while (!salir);
            }char pedirOpcion() {
                String resp;
                System.out.println("Elige una opción (1,2,3 o 0):");

                resp = teclado.nextLine();
                if (resp.isEmpty()) {
                resp = " ";
            }
        return resp.charAt(0);
    }
        //GESTION ARTICULOS
       void gestionArticulosMenu()  {
            boolean salir = false;
            char opcio;
            do {
                System.out.println("Menú de Gestión de Artículos");
                System.out.println("1. Agregar artículo al inventario");
                System.out.println("2. Mostrar artículos");
                System.out.println("3. Eliminar artículo");
                System.out.println("4. Modificar artículo");
                System.out.println("0. Volver al Menú Principal");
                opcio = pedirOpcion();
                switch (opcio) {
                    case '1':
                        añadirArticulo();
                        break;
                    case '2':
                       try {
                                List<Articulo> lista = control.devolverArticulo();
                                for (Articulo a : lista) {
                                    System.out.println(a.toString());
                                }
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }

                        break;
                    case '3':
                        try {
                                List<Articulo> lista = control.devolverArticulo();
                                for (Articulo a : lista) {
                                    System.out.println(a.toString());
                                }
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        EliminarArticulo();
                        break;
                    case '4':
                        try {
                                List<Articulo> lista = control.devolverArticulo();
                                for (Articulo a : lista) {
                                    System.out.println(a.toString());
                                }
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        modificarArticulo();
                        break;
                    case '0':
                        inicio();
                        break;
                }
            } while (!salir);
        }
        /*-------------------AÑADIR--------------------------------------ARTICULO--------------*/
       public void añadirArticulo() {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        int opcion;
        do {
            System.out.println("1. Añadir articulo");
            System.out.println("2. Atrás");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    //Obtener lista articulo primero
                    try {
                                List<Articulo> lista = control.devolverArticulo();
                                for (Articulo a : lista) {
                                    System.out.println(a.toString());
                                }
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                   // Ingresar el código del artículo
                    scanner.nextLine();
                    System.out.print("Indica el codigo del artículo: "); 
                    String codigoArticuloNuevo = scanner.nextLine();
                    // Ingresar la descripción del artículo
                    System.out.print("Indica la descripción del artículo: ");
                    String descripcionArticuloNuevo = scanner.nextLine();
                   
                    // Ingresar el precio de venta del artículo
                    double precioVentaArticuloNuevo = 0;
                    boolean precioValido = false;
                    while (!precioValido) {
                        try {
                            System.out.print("Indica el precio de venta del artículo: ");
                            precioVentaArticuloNuevo = scanner.nextDouble();
                            if (precioVentaArticuloNuevo >= 0) {
                                precioValido = true;
                            } else {
                                System.out.println("El precio debe ser un número positivo.");
                            }
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Por favor, ingresa un valor numérico válido.");
                            scanner.nextLine(); // Limpiar el buffer del scanner
                        }
                    }

                    // Ingresar los gastos de envío del artículo
                    double gastosEnvioArticuloNuevo = 0;
                    boolean gastosEnvioValidos = false;
                    while (!gastosEnvioValidos) {
                        try {
                            System.out.print("Indica los gastos de envío del artículo: ");
                            gastosEnvioArticuloNuevo = scanner.nextDouble();
                            if (gastosEnvioArticuloNuevo >= 0) {
                                gastosEnvioValidos = true;
                            } else {
                                System.out.println("Los gastos de envío deben ser un número positivo.");
                            }
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Por favor, ingresa un valor numérico válido.");
                            scanner.nextLine(); // Limpiar el buffer del scanner
                        }
                    }

                    // Ingresar el tiempo de preparación del artículo
                    int tiempoPreparacionMinutosArticuloNuevo = 0;
                    boolean tiempoPreparacionValido = false;
                    while (!tiempoPreparacionValido) {
                        try {
                            System.out.print("Indica el tiempo de preparación del artículo (min): ");
                            tiempoPreparacionMinutosArticuloNuevo = scanner.nextInt();
                            if (tiempoPreparacionMinutosArticuloNuevo >= 0) {
                                tiempoPreparacionValido = true;
                            } else {
                                System.out.println("El tiempo de preparación debe ser un número positivo.");
                            }
                        } catch (java.util.InputMismatchException e) {
                            System.out.println("Por favor, ingresa un valor numérico válido.");
                            scanner.nextLine(); // Limpiar el buffer del scanner
                        }
                    }
                    
                    Articulo art=new Articulo(control.ultimoArticulo().getIdArticulo()+1,codigoArticuloNuevo, descripcionArticuloNuevo, precioVentaArticuloNuevo, gastosEnvioArticuloNuevo, tiempoPreparacionMinutosArticuloNuevo);
                    control.crearArticulo(art);
                    break;

                case 2:
                    gestionArticulosMenu();
            }
        } 
        while (opcion != 0);
   
        }


        /*-------------------ELIMINAR--------------------------------------ARTICULO--------------*/


      public void EliminarArticulo() {
            try (Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name())) {
                String opcion;

                // Utilizar un bucle while para permitir múltiples eliminaciones
                while (true) {
                    // Ingresar el código del artículo
                    System.out.print("Indica el idArticulo del artículo (o '0' para salir): ");
                    opcion = scanner.nextLine();

                    if (opcion.equals("0")) {
                        // Salir del bucle si el usuario ingresa '0'
                        gestionArticulosMenu();
                    }

                    // Obtener el artículo por código
                    Articulo art = control.devolverArticuloId(Integer.parseInt(opcion));

                    if (art != null) {
                        // Eliminar el artículo
                        control.eliminarArticuloId(Integer.parseInt(opcion)); // Ajustar según tu lógica de eliminación
                        System.out.println("Artículo eliminado exitosamente.");
                    } else {
                        System.out.println("No se ha encontrado un artículo con ese código.");
                    }
                }
            }catch(Exception ex) {
                ex.printStackTrace();
                // Manejar la excepción según tus necesidades
            }
        }
        /*-------------------MODIFICAR--------------------------------------ARTICULO--------------*/
       public void modificarArticulo()  {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
        Articulo art = new Articulo();
        art=null;

        while (art == null) {
            // Ingresar el código del artículo
            System.out.print("Indica el IdArticulo del artículo a modificar: ");
            String codigoArticulo = scanner.nextLine();

            // Buscar el artículo por su código
            art = control.devolverArticuloId(Integer.parseInt(codigoArticulo));
            if (art == null) {
               System.out.println("El artículo con código " + codigoArticulo + " no existe. Intenta de nuevo.");
            }
       }
        // Verificar si se encontró el artículo
        if (art != null) {
                    // Mostrar la información actual del artículo
                    System.out.println("Información actual del artículo:");
                    System.out.println(art.toString());
                    System.out.print("Nuevo código (dejar en blanco para mantener el valor actual): ");
                    String nuevoCodigo = solicitarNoVacio(scanner, art.getCodigo());
                    // Solicitar nuevos valores para los campos que deseas modificar
                    System.out.print("Nuevo precio de venta (dejar en blanco para mantener el valor actual): ");
                    Double nuevoPrecioVenta = solicitarDouble(scanner, art.getPrecioVenta());

                    System.out.print("Nuevo gasto de envío (dejar en blanco para mantener el valor actual): ");
                    Double nuevoGastoEnvio = solicitarDouble(scanner, art.getGastosEnvio());

                    System.out.print("Nuevo tiempo de preparación (minutos) (dejar en blanco para mantener el valor actual): ");
                    Integer nuevoTiempoPreparacion = solicitarInt(scanner, art.getTiempoPreparacionMinutos());

                    System.out.print("Nueva descripción (dejar en blanco para mantener el valor actual): ");
                    String nuevaDescripcion = solicitarNoVacio(scanner, art.getDescripcion());

                    // Actualizar el artículo con los nuevos valores
                    
                    art.setCodigo(nuevoCodigo);
                    art.setPrecioVenta(nuevoPrecioVenta);
                    art.setGastosEnvio(nuevoGastoEnvio);
                    art.setTiempoPreparacionMinutos(nuevoTiempoPreparacion);
                    art.setDescripcion(nuevaDescripcion);

                    // Llamar al controlador para actualizar el artículo en la base de datos
                    control.editarArticulo(art);

                    System.out.println("Artículo modificado exitosamente.");
                } else {
                    System.out.println("No se ha encontrado un artículo con ese código.");
                }
}
        // Métodos de utilidad para solicitar valores numéricos válidos, permitiendo mantener el valor actual si no se ingresa nada
        // PARA NO EXTENDER MUCHO CÓDIGO LÓGICO.--------------------------------------------------------------------------------       
        private Double solicitarDouble(Scanner scanner, Double valorActual) {
            while (true) {
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    return valorActual;
                }

                try {
                    return Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.print("Por favor, ingresa un valor numérico válido o deja en blanco para mantener el valor actual: ");
                }
            }
        }
        private Integer solicitarInt(Scanner scanner, Integer valorActual) {
            while (true) {
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    return valorActual;
                }

                try {
                    return Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.print("Por favor, ingresa un valor entero válido o deja en blanco para mantener el valor actual: ");
                }
            }
        }
        private String solicitarNoVacio(Scanner scanner, String valorActual) {
            while (true) {
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    return valorActual;
                } else {
                    return input;
                }
            }
        }
/*-------------------------------------------------------------------------------------------------------------------------------------*/
/*---------------------------------------FIN ARTÍCULO----------------------------------------------------------------------------------*/
/*-------------------------------------------------------------------------------------------------------------------------------------*/
        
        //GESTION CLIENTES--------------------------------------------------------------------------
        void gestionClientesMenu()  {
            boolean salir = false;
            char opcio;
            do {
                System.out.println("Menú de Gestión de Clientes");
                System.out.println("1. Agregar cliente");
                System.out.println("2. Mostrar clientes");
                System.out.println("3. Mostrar clientes estándar");
                System.out.println("4. Mostrar clientes premium");
                System.out.println("0. Volver al Menú Principal");
                opcio = pedirOpcion();
                switch (opcio) {
                    case '1':
                        añadirCliente();
                        break;
                    case '2':                        
                       try {
                                List<Cliente> lista = control.devolverCliente();
                                for (Cliente a : lista) {
                                    System.out.println(a.toString());
                                }
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }

                        break;
                    case '3':
                        try {
                                List<Cliente> lista = control.devolverCliente();
                                for (Cliente a : lista) {
                                   if(a.getTipoCliente().equals("estandar")){ 
                                     System.out.println(a.toString());
                                   
                                   }
                                }
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }

                        break;

                    case '4':
                       try {
                                List<Cliente> lista = control.devolverCliente();
                                for (Cliente a : lista) {
                                   if(a.getTipoCliente().equals("premium")){ 
                                     System.out.println(a.toString());
                                   
                                   }
                                }
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }

                        break;
                    case '0':
                        inicio();
                        break;
                }
            } while (!salir);
        }
        public void añadirCliente() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Cliente Estándar");
            System.out.println("2. Cliente Premium");
            System.out.println("3. Atrás");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    String tipoClienteNuevo = "estandar"; 
                    
                    
                    System.out.print("Indica el nombre del cliente: ");
                    scanner.nextLine(); // Consumir la nueva línea restante
                    String nombreClienteNuevo = scanner.nextLine();
                    System.out.print("Indica el email del cliente: ");
                    String emailClienteNuevo = scanner.nextLine();
                    System.out.print("Indica la direccion del cliente: ");
                    String direccionClienteNuevo = scanner.nextLine();
                    System.out.print("Indica el nif del cliente: ");
                    String nifClienteNuevo = scanner.nextLine();
                    Cliente cliente= new Cliente(control.ultimoCliente().getIdCliente()+1,tipoClienteNuevo, emailClienteNuevo, nombreClienteNuevo, direccionClienteNuevo, nifClienteNuevo,0,0);
                    control.crearCliente(cliente);
                    break;
                case 2:
                    
                    String tipoClienteNuevoPremium = "premium"; 
                    
                    System.out.print("Indica el nombre del cliente: ");
                    scanner.nextLine(); // Consumir la nueva línea restante
                    String nombreClienteNuevoPremium = scanner.nextLine();
                    System.out.print("Indica el email del cliente: ");
                    String emailClienteNuevoPremium = scanner.nextLine();
                    System.out.print("Indica la direccion del cliente: ");
                    String direccionClienteNuevoPremium = scanner.nextLine();
                    System.out.print("Indica el nif del cliente: ");
                    String nifClienteNuevoPremium = scanner.nextLine();
                    Cliente cli= new Cliente(control.ultimoCliente().getIdCliente()+1 ,tipoClienteNuevoPremium, emailClienteNuevoPremium, nombreClienteNuevoPremium, direccionClienteNuevoPremium, nifClienteNuevoPremium,2,1);
                    control.crearCliente(cli);
                    break;
                case 3:
                    gestionClientesMenu();
            }
        } 
        while (opcion != 0);
        // GESTION PEDIDOS
        }
        // GESTION PEDIDOS
       void gestionPedidosMenu()  {
            Scanner scanner = new Scanner(System.in);
            boolean salir = false;
            char opcio;
            do {
                System.out.println("Menú de Gestión de Pedidos");                                                                   
                System.out.println("1. Agregar Pedido");
                System.out.println("2. Eliminar Pedidos");
                System.out.println("3. Mostrar Pedidos");
                System.out.println("0. Volver al Menú Principal");
                opcio = pedirOpcion();
                switch (opcio) {
                    case '1':
                        añadirPedido();
                        break;
                    case '2':
                         //Obtener lista articulo primero
                       try {
                                List<Pedido> lista = control.devolverPedido();
                                for (Pedido a : lista) {
                                    System.out.println(a.toString());
                            }
                            }catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        System.out.print("Indica el IdPedido a eliminar: ");
                        int numeroPedidoEliminar = scanner.nextInt ();
                        control.eliminarPedidoId(numeroPedidoEliminar);
                        gestionPedidosMenu();
                        break;
                    case '3':
                         try {
                                List<Pedido> lista = control.devolverPedido();
                                for (Pedido a : lista) {
                                    System.out.println(a.toString());
                            }
                            }catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        break;
                    case '0':
                        inicio();
                        break;
                }
            } while (!salir);
        
        }
       
    public void añadirPedido()  {
            Scanner scanner = new Scanner(System.in);
            int opcion;
            do {
                System.out.println("1. Añadir pedido");
                System.out.println("2. Atrás");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        //Mostrar clientes:
                        try {
                                List<Cliente> lista = control.devolverCliente();
                                for (Cliente a : lista) {
                                    System.out.println(a.toString());
                                }
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }

                        System.out.print("Indica el email del cliente: ");
                        scanner.nextLine(); // Consumir la nueva línea restante
                        String emailClientePedidoNuevo = scanner.nextLine();

                        Cliente clienteExistente = control.encontrarClientePorEmail(emailClientePedidoNuevo);
                         System.out.print(clienteExistente + "\n");
                        if (clienteExistente != null) {
                            añadirPedido2(clienteExistente); // Pasa el objeto Cliente existente a añadirPedido2
                        } else {
                            System.out.println("El cliente no existe, tienes que añadirlo ");
                            añadirCliente();
                        }
                        break;
                    case 2:
                        gestionClientesMenu();
                        break;
                }
            } while (opcion != 0);
        }
        public void añadirPedido2(Cliente clienteExistente)  {
            Scanner scanner = new Scanner(System.in);
            int codigoArticuloPedidoNuevo=0;
            int opcion;
            do {
                System.out.println("1. Continuar añadiendo pedido");
                System.out.println("2. Atrás");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Indica el número de pedido: ");
                        scanner.nextLine(); // Consumir la nueva línea restante
                        int numeroPedidoNuevo = scanner.nextInt();
                        // Obtén el idCliente del cliente existente
                        int idCliente = clienteExistente.getIdCliente();
                        scanner.nextLine();
                        System.out.print(idCliente + "\n");
                        try {
                                List<Articulo> lista = control.devolverArticulo();
                                for (Articulo a : lista) {
                                    System.out.println(a.toString());
                                }
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        //*CONTROLAR QUE NO DE ERROR------------------------------------*//
                        while (true) {
                                try {
                                    System.out.print("Indica el idArticulo del artículo: ");
                                    codigoArticuloPedidoNuevo = scanner.nextInt();
                                    break; // Salir del bucle si se proporciona un valor válido
                                } catch (java.util.InputMismatchException e) {
                                    System.out.println("Error: Debes ingresar un número entero. Inténtalo de nuevo.");
                                    scanner.nextLine(); // Limpiar el buffer del scanner
                                }
                         }
                       
                        Articulo art = control.devolverArticuloId(codigoArticuloPedidoNuevo);
                        int cantidadPedidoNuevo = 0;
                         while (true) {
                           try {
                                    System.out.print("Indica la cantidad: ");
                                    cantidadPedidoNuevo = scanner.nextInt();
                                    break;// Salir del bucle si se proporciona un valor válido
                                } catch (java.util.InputMismatchException e) {
                                    System.out.println("Error: Debes ingresar una cantidad. Inténtalo de nuevo.");
                                    scanner.nextLine(); // Limpiar el buffer del scanner
                                }
                         }       
                        Date fechaPedidoNuevo = new Date();
                         // Utiliza el objeto Cliente existente y el idCliente para crear el pedido
                        if (clienteExistente.getEmail() != null) {
                            // Obtén el objeto Articulo de la base de datos utilizando el código
                            Articulo articulo = control.devolverArticuloId(codigoArticuloPedidoNuevo);

                            // Verifica si el artículo se encontró en la base de datos
                            if (articulo.getCodigo()!= null) {
                                // Crea el pedido utilizando el cliente, artículo, idCliente y otros datos
                                Pedido pedidoNuevo = new Pedido(control.ultimoPedido().getIdPedido()+1 ,numeroPedidoNuevo, clienteExistente.getIdCliente(), articulo.getCodigo(), cantidadPedidoNuevo, fechaPedidoNuevo);
                                control.crearPedido(pedidoNuevo);
                            } else {
                                System.out.println("Artículo no encontrado.");
                            }
                        } else {
                            System.out.println("Cliente no encontrado.");
                        }
                        break;
                    case 2:
                        gestionPedidosMenu();
                        break;
                }
            } while (opcion != 0);
        }
        
        
        void obtenerPedidosMenu() {
            Scanner scanner = new Scanner(System.in);
            boolean salir = false;
            char opcio;
            do {
                System.out.println("Menú de Gestión de Pedidos");
                System.out.println("1. Pedidos pendientes");
                System.out.println("2. Pedidos enviados");
                System.out.println("3. Atrás");
                opcio = pedirOpcion();
                switch (opcio) {
                    case '1':
                         //Mostrar clientes:
                        try {
                                List<Cliente> lista = control.devolverCliente();
                                for (Cliente a : lista) {
                                    System.out.println(a.toString());
                                }
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        System.out.print("Indica el email del cliente: ");
                        String emailClientePendientes = scanner.nextLine();
                        ///controlador.obtenerPedidosPendientes(emailClientePendientes);
                        break;
                    case '2':
                         //Mostrar clientes:
                        try {
                                List<Cliente> lista = control.devolverCliente();
                                for (Cliente a : lista) {
                                    System.out.println(a.toString());
                                }
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        System.out.print("Indica el email del cliente: ");
                        String emailClienteEnviados = scanner.nextLine();
                        ///controlador.obtenerPedidosEnviados(emailClienteEnviados);
                        break;
                    case '3':
                        gestionPedidosMenu();
                        break;
                }
            } while (!salir);
        
}
} 
