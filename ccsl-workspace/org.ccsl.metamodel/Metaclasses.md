# List of CCSL Metaclasses

This document lists all the metaclasses currently available in the CCSL metamodel. They are organized both by _logical_ packages as defiend in the pappers (bigger labels) and by implementation pacakges of their Ecore realization (smaller labels).

# Core Package

## Core
- Rule
- CompositeRule
- AtomicRule
- Root
- FaultTypeDescription

## Elements
- Element
- ControlledAccessElement
- Annotable

## Context
- Context

# NamedElements package

## Elements / NamedElements
- NamedElement
- Package

## Elements / NamedElements / Variable
- Variable
- ParameterVariable
- LocalVariable
- InitializableVariable
- FieldVariable

## Elements / NamedElements / ComplexType
- JInterface
- AnonymousClass
- JClass
- TypeDeclaration
- ComplexType
- AnnotationType
- AnnotationField
- JEnum
- ComplexTypeDeclaration
- ConstructComplexTypeDeclaration
- EnumConstant

## Elements / NamedElements / Method
- Constructor
- SimpleMethod
- Method

# Statements package

## Elements / Statements
- Statement
- ControlFlowStatement
- Block
- InstanceCreation
- SynchronizedBlock
- ThrowStatement
- EmptyStatement
- ReturnStatement
- BreakStatement
- ContinueStatement
- AssertStatement
- ExpressionStatement
- LabelStatement

## Elements / Statements / ControlFlow
- SwitchStatement
- SwitchCaseBlock
- IfStatement
- LoopStatement
- WhileStatement
- DoStatement
- ForStatement
- ForEachStatement
- ConditionalControlFlowStatement

## Elements / Statements / TryCatch
- TryStatement
- CatchClause

## Elements / Statements / Import
- ImportableElement
- ImportStatement

# DataType package

## Elements / DataType
- DataType
- PrimitiveType
- BooleanPrimitiveType
- ShortPrimitiveType
- ObjectType
- ParameterizedType
- IntPrimitiveType
- ArrayType
- VoidType
- TypeParameter
- WildCardType
- BytePrimitiveType
- CharPrimitiveType
- DoublePrimitiveType
- FloatPrimitiveType
- LongPrimitiveType

# Expressions package

## Elements / Expressions
- Expression
- VarDeclaration
- CastExpression
- TernaryExpression
- InstanceofExpression
- ArithmeticExpression
- StringConcatenation
- BooleanExpression
- BinaryExpression
- OperandExpression

## Elements / Expressions / Invocations
- MethodInvocation
- Invocation
- ConstructorInvocation
- SuperMethodInvocation

## Elements / Expressions / Accesses
- VariableAccess
- DataTypeAccess
- Access

## Elements / Expressions / Arrays
- ArrayCreation
- ArrayIndexesAccess
- ArrayInitializer

## Elements / Expressions / Assignment
- SimpleAssignment
- Assignment
- UnaryAssignment

## Elements / Expressions / Literals
- LiteralValue
- NullLiteral
- CharacterLiteral
- StringLiteral
- NumberLiteral
- BooleanLiteral

## Elements / Expressions / Annotation
- Annotation
- AnnotationFieldValue

# Filters package

## Functions
- CcslFunction

## Functions / BooleanFunctions
- CcslBooleanFunction

## Functions / BooleanFunctions / Filters
- Filter
- AtomicFilter
- CompositeFilter
- PropertyFilter
- TemplateFilter
- SameNameFilter
- CountFilter
- RegexMatch
- ImplicityOperandFilter
- ImplicityContainerFilter
- IsKindOfFilter
- SuperMethodClosureFilter
- IsTypeOfFilter
- ChildClosureComplexTypeFilter
- IsStringFilter
- EquationFilter
- FromClosureFilter
- HasSuperClassFilter
- BlockLastStatementFilter
- HasSameReferenceFilter
- IsEmptyBlockFilter
- ImplicitContentsFilter

## Functions / NumberFunctions
- CcslNumberFunction
- CcslIntegerLiteral
- GetIndexOf

# FaultTypeDescription package

This package contains extensions that enable the usage of CCSL for model-driven fault injection. In this case, CCSL is used to specify faults to be injected in a Java software. Please [see our paper at ISSRE 2020](https://ieeexplore.ieee.org/document/9251070) for further details on this package.

## FaultTypeDescription
- InjectionAction
- InjectionStrategy

## FaultTypeDescription / Action
- DeleteAction
- MoveScopeUpAction
- DeleteInfixOperatorAction
- ChangeLiteralValueAction
- DeleteRandomStatementAction
- ReplaceVariableAccessAction
- ReplaceArithmeticOperatorAction
- ArithmeticOperatorMap

## FaultTypeDescription / Strategy
- AllStrategy
