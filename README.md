- BC3- COLECCIONES, FICHEROS Y ENTRADA/SALIDA
- ITERADORES
Filtrado de Palabras por Inicial
Programa en Java diseñado para gestionar colecciones de texto y eliminar elementos basados en un criterio alfabético específico.

🚀 Funcionalidades
- Gestión de Conjuntos: Utiliza un HashSet para almacenar palabras, garantizando que no existan duplicados en la colección.
- Detección de Patrones: Identifica palabras que comienzan con la letra "A", independientemente de si están en mayúsculas o minúsculas.
- Limpieza Automática: Remueve de forma dinámica los elementos que coinciden con el criterio de filtrado.

🛠️ Estructura técnica
- El programa implementa una lógica de filtrado robusta mediante:
- toUpperCase().startsWith("A"): Normaliza el texto para asegurar que la comparación sea precisa.
- Iterator: Permite la eliminación segura de objetos dentro de un Set mientras se recorre la estructura, evitando errores de modificación concurrente.
