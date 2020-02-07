ruleset {
    ruleset('rulesets/naming.xml') {
        exclude 'ClassNameSameAsFilename'

        'ClassName' {
            regex = '^[A-Z]([a-zA-Z0-9$_])*\\b'
            doNotApplyToClassNames='$Temp,fileNameFinderTest,rayMain'
        }
        'FieldName' {
            regex = '^[a-z]([a-zA-Z0-9$])*\\b'
            finalRegex = '^[a-z]([a-zA-Z0-9$])*\\b'
            staticFinalRegex = '^[A-Z]([A-Z0-9$_])*\\b|^serialVersionUID\\b'
            staticRegex = '^[A-Z]([A-Z0-9$_])*\\b'
        }
        'PropertyName' {
            regex = '^[a-z]([a-zA-Z0-9$])*\\b'
            finalRegex = '^[a-z]([a-zA-Z0-9$])*\\b'
            staticFinalRegex = '^[A-Z]([A-Z0-9$_])*\\b|^serialVersionUID\\b'
            staticRegex = '^[A-Z]([A-Z0-9$_])*\\b'
        }
        'VariableName' {
            regex = '^[a-z]([a-zA-Z0-9$])*\\b'
            finalRegex = '^[a-z]([a-zA-Z0-9$])*\\b'
        }
    }

    ruleset('rulesets/imports.xml') {
        exclude 'ImportFromSamePackage'
        exclude 'MisorderedStaticImports'
    }

    ruleset('rulesets/logging.xml') {
        exclude 'SystemOutPrint'
        exclude 'SystemErrPrint'
    }
    ruleset('rulesets/braces.xml') {
        exclude 'ForStatementBraces'
        exclude 'IfStatementBraces'
        exclude 'WhileStatementBraces'
        exclude 'ElseBlockBraces'
    }
    ruleset('rulesets/size.xml') {
        exclude 'CyclomaticComplexity'
        exclude 'AbcMetric'
        exclude 'MethodSize'
        exclude 'MethodCount'
        exclude 'ClassSize'
        exclude 'MethodSizeCount'
        exclude 'NestedBlockDepth'
    }
    ruleset('rulesets/junit.xml') {
        exclude 'JUnitStyleAssertions'
        exclude 'JUnitTestMethodWithoutAssert'
        exclude 'JUnitLostTest'
    }

    ruleset('rulesets/concurrency.xml') {
        exclude 'SynchronizedMethod'
        exclude 'WaitOutsideOfWhileLoop'
        exclude 'SynchronizedOnThis'
    }

    ruleset('rulesets/dry.xml') {
        exclude 'DuplicateNumberLiteral'
        exclude 'DuplicateStringLiteralRule'
        exclude 'DuplicateStringLiteral'
    }
    ruleset('rulesets/design.xml') {
        exclude 'EmptyMethodInAbstractClass'
        exclude 'ImplementationAsType'
        exclude 'AbstractClassWithoutAbstractMethod'
        exclude 'ConstantsOnlyInterface'
        exclude 'FinalClassWithProtectedMember'
    }
    ruleset('rulesets/exceptions.xml') {
        exclude 'ThrowRuntimeException'
        exclude 'ThrowException'
        exclude 'CatchThrowable'
        exclude 'CatchException'
        exclude 'CatchRuntimeException'
        exclude 'CatchNullPointerException'
        exclude 'ReturnNullFromCatchBlock'
        exclude 'ThrowNullPointerException'
        exclude 'CatchIllegalMonitorStateException'
        exclude 'CatchError'
        exclude 'ExceptionExtendsError'
        exclude 'ThrowError'
    }
}