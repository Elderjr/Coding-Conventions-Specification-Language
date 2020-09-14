The CCSL workspace is organized as follows:
* The [org.ccsl.checker](https://github.com/Elderjr/Coding-Conventions-Specification-Language/tree/master/ccsl-workspace/org.ccsl.checker) project is an Eclipse plugin project. It is a GUI prototype of CCSL. By importing this project and running it as an "Eclipse application"
a new Eclipse instance will be launched. This new Eclipse instance contains a new menu item ("CCSL> Run CCSL checker") and when it is selected a window will appear where the user will be able to select which projects he wants to analyze and which verifiers
he wants to use. The checkers can be either ccsl instances (files with ccsl extension) or the generated ocl files (see org.ccsl.gen.ocl).
* The [org.ccsl.gen.ocl](https://github.com/Elderjr/Coding-Conventions-Specification-Language/tree/master/ccsl-workspace/org.ccsl.gen.ocl) is an Acceleo Project. This project implements a Model-to-Text transformation which takes a ccsl instance and generates an ocl query. The ocl query 
retrieves the elements in the MoDisco model (a model that represents Java Source Code) that are violations according to the ccsl specification.
* The [org.ccsl.metamodel](https://github.com/Elderjr/Coding-Conventions-Specification-Language/tree/master/ccsl-workspace/org.ccsl.metamodel) is an Ecore Project. This project specifies the CCSL metaclasses and their relationships.
Files with 'ccsl' extensions are instances of the CCSL metaclasses.
* The [org.ccsl.metamodel.examples](https://github.com/Elderjr/Coding-Conventions-Specification-Language/tree/master/ccsl-workspace/org.ccsl.metamodel.examples) provides examples of CCSL instances of existing coding conventions, in particular those implemented by PMD.
