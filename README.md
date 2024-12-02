## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).




# DEBER DE CLASES GENERICAS

# Ejemplo de clase genérica con una lista personalizada en Java

Este proyecto implementa una clase genérica llamada `MiLista` que permite manejar una lista personalizada de elementos de cualquier tipo.

## ¿Qué son las clases genéricas?

Las clases genéricas son una característica de Java que permite crear estructuras de datos y métodos que funcionan con cualquier tipo de dato, proporcionando flexibilidad y seguridad de tipos.

## Clase implementada

### `MiLista<T>`
La clase `MiLista` utiliza un tipo genérico `T` y encapsula una lista interna de elementos (`ArrayList<T>`).

#### Métodos principales:
- `agregar(T elemento)`: Agrega un elemento a la lista.
- `T obtener(int indice)`: Obtiene un elemento de la lista por su índice.
- `mostrar()`: Muestra todos los elementos de la lista.

