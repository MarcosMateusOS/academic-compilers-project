.source JasminGenerated
.class public JasminGenerated
.super java/lang/Object


    .method static inicio([Ljava/lang/String;)V
        .limit stack 50
        .limit locals 1
        new Ponto
        istore 0

        return
    .end method


    .method public static main([Ljava/lang/String;)V
        .limit stack 1
        ldc 0  ; 
        anewarray java/lang/String
        invokestatic JasminGenerated/inicio([Ljava/lang/String;)V
        return
    .end method


.class public Ponto
.super java/lang/Object

	.field public x F
	.field public y F

	.method public getx()x
	    .limit stack 1
	    .limit locals 1
	    aload_0
	    getfield Ponto/x x
	    return
	.end method

	.method public gety()y
	    .limit stack 1
	    .limit locals 1
	    aload_0
	    getfield Ponto/y y
	    return
	.end method


	.method public setx(x)V
	    .limit stack 2
	    .limit locals 2
	    aload_0
	    aload_1
	    putfield Ponto/x x
	    return
	.end method
	.method public sety(y)V
	    .limit stack 2
	    .limit locals 2
	    aload_0
	    aload_1
	    putfield Ponto/y y
	    return
	.end method

	.method public Ponto()V
	    .limit stack 2
	    .limit locals 1
	    aload_0
	    invokespecial java/lang/Object/Ponto()V
	    return
	.end method

	

