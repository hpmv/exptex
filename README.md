exptex
=============
An expression-transforming LaTeX preprocessor.

Input:
```
\documentclass{article}
\usepackage{amsmath}
\begin{document}
This is what happens when one day I'm annoyed by LaTeX.

exptex preprocesses math expressions like $a^2==b (mod (p-1)/2)$ turning them into messier LaTeX code.

This is experimental, done with ANTLR 4, but should be expanded in the future to support more things.

Currently here are some cool things you can do:

$$limit as x->0 of sin(alpha x)/x=limit as x->0 of (sin(alpha x)-sin(0))/(x-0)$$

Auto align:
$$
prod of a_i for i=1..8
=a1a2....a8
>=a1a1....a1
>=a1^8
>2^8=256
$$

\end{document}
```

Result:
```
\documentclass{article}
\usepackage{amsmath}
\begin{document}
This is what happens when one day I'm annoyed by LaTeX.

exptex preprocesses math expressions like $a^{2}\equiv b \pmod{\frac{p- 1}{2}}$ turning them into messier LaTeX code.

This is experimental, done with ANTLR 4, but should be expanded in the future to support more things.

Currently here are some cool things you can do:

$${\lim_{x\rightarrow 0}\frac{{\mathrm{sin}\left(\alpha x\right)}}{x}}= {\lim_{x\rightarrow 0}\frac{{\mathrm{sin}\left(\alpha x\right)}- {\mathrm{sin}\left(0\right)}}{x- 0}}$$

Auto align:
\begin{align*}
{}& {\prod_{i= 1}^{8}a_{i}}\\
= {}& a_{1}a_{2}\cdots a_{8}\\
\geq {}& a_{1}a_{1}\cdots a_{1}\\
\geq {}& a_{1}^{8}\\
> {}& 2^{8}= 256\end{align*}

\end{document}
```