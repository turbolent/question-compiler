package com.turbolent.questionCompiler.sparql

sealed trait NodeCompilationContext

case object TripleNodeCompilationContext extends NodeCompilationContext
case object FilterNodeCompilationContext extends NodeCompilationContext
