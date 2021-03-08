# Coding Conventions Specification Language
Coding Conventions Specification Language (CCSL) is a language which formalize coding conventions using Model Driven Engineering (MDE) techniques.

## Dependencies
The metamodel (abstract syntax) of CCSL was defined using the Ecore metamodeling language, which is part of the Eclipse Modeling Framework (EMF). 
To be able to import this project it is necessary to install the [Eclipse IDE](https://www.eclipse.org/downloads/) with the [EcoreTools](https://www.eclipse.org/ecoretools/download.html) and PDE (Plug-in Development Environment, only needed to create an instance of the metamodel) plugins.

## Examples
CCSL was evaluated using two popular coding conventions set for the Java language: [PMD](https://pmd.github.io/) and [SEI CERT Oracle Coding Conventions for Java](https://wiki.sei.cmu.edu/confluence/display/java/SEI+CERT+Oracle+Coding+Standard+for+Java).
Each rule in the selected subsets was manually analyzed and a specification using CCSL was attempted. Whether a rule can be formalized or not is somehow subjective, as it depends also on the skill of the modeler.
Each of the analyzed coding rules has been classified in one of three groups: exact (it was possible to represent the original rule),
partial (it was needed to change the original rule) or difficult (it was not possible to formalize the rule using the current state of CCSL). The classifications and formalizations can be cheked in [rules folder](https://github.com/Elderjr/Coding-Conventions-Specification-Language/tree/master/rules).

## Documentation
A full list of the CSSL metaclasses is available [here](ccsl-workspace/org.ccsl.metamodel/Metaclasses.md).
