## <a name="content-id"></a> Contenido
1. [Introducción](#intro-id)
2. [Java EE 8](#java-id)
3. [Requisitos Software](#req-id)
4. [Patrones de diseño](#pat-id)
5. [Proyecto](#pro-id)
6. [Servlet-JSP](#sp-id)
7. [JSF](#jsf-id)
8. [JPA](#jpa-id)

---
## <a name="intro-id"></a>Introducción
En 2017 Oracle decidió dejar de controlar el desarrollo de Java EE y empezarían por buscar una organización open source a la que pasar la batuta. Esa organización terminó siendo la [Eclipse Foundation](https://www.eclipse.org/) , la misma comunidad detrás de la plataforma Eclipse que consiste en el IDE y el ambiente de desarrollo.

Oracle dijo que la razón de esto era mejorar el proceso de desarrollo de Java EE que a pesar de ya desarrollarse de forma abierta con la ayuda de la comunidad, debería tener un proceso más flexible y abierto. Pero flexible es algo que Oracle no es a la hora de usar la marca Java, y por ello Java EE ha tenido que cambiar de nombre a Jakarta EE.

El nuevo nombre fue elegido por casi 7.000 personas que votaron en una encuesta hecha a la comunidad de Eclipse. La decisión estaba entre usar "Jakarta EE" o "Enterprise Profile" y la primera opción [ ganó con el 64% de los votos.](https://mmilinkov.wordpress.com/2018/02/26/and-the-name-is/)

Varias partes del proyecto han recibido nuevos nombres. Ahora que Java EE es Jakarta EE, Glassfish pasa a ser Eclipse Glassfish, Java Community Process (JCP) pasa a llamarse Eclipse EE.next Working Group (EE.next), y Oracle development management ahora es Eclipse Enterprise for Java (EE4J) y Project Management Committee (PMC).

Java EE (Java Platform, Enterprise Edition) es una plataforma de programación para desarrollar y ejecutar software empresarial usando el lenguaje de programación Java. Java EE también es considerado como un estándar, y aunque Oracle continuará ofreciendo soporte a las implementaciones actuales de Java EE y participando de alguna forma en las futuras tecnologías que se desarrollen, el control lo tiene ahora la Fundación Eclipse y la comunidad open source.

#### [Ir a Contenido](#content-id)
---
## <a name="java-id"></a> Java EE 8
Java EE 8 admite muchas nuevas especificaciones de tecnología Java, que incluyen:

 ![Getting Started](./images/1.png)


* **Bean Validation 2.0**
Esta es una especificación de java el cual nos permita expresar restricciones en los objetos usando anotaciones, además de crear nuestras propias restricciones. También proporciona las APIs para validar objetos así como su representación, y también valida los parámetros recibidos y los valores devueltos de los métodos y los constructores.

* **CDI 2.0**
Inyección de Contexto y Dependencia (Contexts and Dependency Injection) para  Java EE define un potente conjunto de servicios complementarios que nos ayudarán a mejorar la estructura del código de una aplicación. 

* **JAX-RS 2.1**
Eventos enviados por Servidor (del inglés Server-Sent Events (SSE)) es una tecnología nueva definida como parte de HTML 5 que establece recomendaciones para que un cliente obtenga actualizaciones desde el servidor HTTP de manera automática. Es comúnmente empleado para transmisiones de data streaming de un sentido, en el que el servidor actualiza su información y le notifica al cliente periódicamente, o cada vez que sucede un evento.

* **JAX-RS 2.0** 
Presenta APIS  de procesamiento asíncrono tanto para cliente como para servidor. 

* **JSF 2.3**
La tecnología JSF simplica la construcciones de interfaces para aplicaciones JavaServer. Los desarrolladores pueden construir rápidamente aplicaciones web para: ensamblar componentes UI reutilizables en una página, conectar estos componentes a una fuente de datos y conectar eventos en el cliente a los eventos del servidor. Ahora tenemos una característica llamada invocación Ajax que permite invocar métodos de un Managed Bean (CDI) directamente desde Ajax, permitiendo responder usando el estándar JSON.  Esta versión también permite validaciones en varios campos, @Inject FacesContext, rendimiento optimizado en EL, y aclaraciones Ajax cruzadas. Además, es compatible como MVC 1.0.

* **JSON-P 1.1**
Esta versión ofrece   JSON Patch, JSON Merge y JSON Pointer. También usa los streams y lambdas de Java SE 8.

* **Servlet 4.0**
Una de las características más esperadas para Java EE8 es HTTP/2.0 y Server Push, el cual  trae un aumento de rendimiento para las aplicaciones JSF. Solo basta con migrar a un servidor que sea compatible con Java EE 8.

* **JSON-B 1.0**
Es una capa de unión estándar para convertir objetos Java hacia y desde mensajes JSON. Define un algoritmo de mapeo por omisión para convertir clases Java existentes a JSON, y también permite al desarrolladores personalizar el proceso de mapeo a traves de anotaciones Java. Esto ya lo vimos en un post anterior: Un vistazo a JSON-B de Java EE8

* **Security API**
Este API es muy usado en el moderno paradigma de aplicaciones en la nube/PaaS. Promueve portabilidad en aplicaciones autocontenidas para todos los servidores Java EE, y promueve el uso de modernos conceptos de programación tales como lenguajes de expresión, e inyección de depedencia y contexto.

Video 
[![Java EE8](./images/2.jpg)](https://youtu.be/FCsqchsK9UA "Java EE8")

#### [Ir a Contenido](#content-id)
---

## <a name="req-id"></a>Requisitos de Software

En el siguiente enlace encontraras el software que debes instalar y configurar.

[Guia](https://drive.google.com/open?id=1QYuFhqT_IKzmI5Mu5cR4fPQRWYvm12sQ)

#### [Ir a Contenido](#content-id)
---

## <a name="pat-id"></a>Patrones de diseño
Una fase muy importante en el ciclo de vida de un proyecto es el Diseño del Software. Se trata de una etapa fundamental y en muchas ocasiones la más importante en el desarrollo de Software. Es el momento en que los profesionales tienen que aportar sus conocimientos, experiencia y creatividad para llegar a una solución que cumpla con los requisitos funcionales y no funcionales 
establecidos en la fase de la toma de requisitos.

Para ello debemos conocer y aplicar los patrones de diseño. Estos son soluciones (ya probadas y documentadas) a problemas de desarrollo conocidos.

En la implementación del la aplicación utilizaremos 4 patrones:

* [Patrón MVC Model View Controller.](https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm) 
* [Patrón DAO: Data Access Object.](https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm)
* [Patrón TO: Transfer Object.](https://www.tutorialspoint.com/design_pattern/transfer_object_pattern.htm) 
* [Patrón DI: Dependency Injection.](https://es.wikipedia.org/wiki/Inyecci%C3%B3n_de_dependencias) 

Los invito a revisar el siguiente enlace de Martin Fowler para complementar esta sección.

* [Software Design](https://www.martinfowler.com/design.html). 

#### [Ir a Contenido](#content-id)
---
## <a name="pro-id"></a>Proyecto
#### [Ir a Contenido](#content-id)
---
## <a name="sp-id"></a>Servlet - JSP
#### [Ir a Contenido](#content-id)
---
## <a name="jsf-id"></a>JSF
#### [Ir a Contenido](#content-id)
---
## <a name="jpa-id"></a>JPA
#### [Ir a Contenido](#content-id)
---
## CDI





