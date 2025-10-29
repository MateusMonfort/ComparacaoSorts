# ComparacaoSorts

Comparação de desempenho de 6 algoritmos de ordenação implementados manualmente em Java.

## Algoritmos
- Bubble Sort (com Flag)
- Selection Sort
- Cocktail Sort
- Comb Sort
- Gnome Sort
- Bucket Sort

## Como Executar
```bash
# Compilar (gera .class na pasta bin)
javac -d bin *.java

# Executar
java -cp bin Main
```

## Resultados dos Testes

### Vetores
- **Vetor 1 (Aleatório)**: 20 elementos desordenados
- **Vetor 2 (Ordenado)**: 20 elementos já ordenados
- **Vetor 3 (Invertido)**: 20 elementos em ordem decrescente

### Tabela Completa de Resultados

| Algoritmo | Vetor 1 (Aleatório) | Vetor 2 (Ordenado) | Vetor 3 (Invertido) |
|-----------|--------------------|--------------------|---------------------|
| Bubble Sort (Flag) | T: 78 / I: 180 | T: 0 / I: 19 | T: 190 / I: 190 |
| Selection Sort | T: 18 / I: 190 | T: 0 / I: 190 | T: 10 / I: 190 |
| Cocktail Sort | T: 78 / I: 154 | T: 0 / I: 19 | T: 190 / I: 190 |
| Comb Sort | T: 22 / I: 129 | T: 0 / I: 110 | T: 18 / I: 129 |
| Gnome Sort | T: 78 / I: 176 | T: 0 / I: 20 | T: 190 / I: 400 |
| Bucket Sort | T: 19 / I: 63 | T: 0 / I: 63 | T: 74 / I: 63 |

*T = Trocas, I = Iterações*

## Ranking: Menos Trocas

### Vetor Aleatório
| Posição | Algoritmo | Trocas |
|---------|-----------|--------|
| 1º | Bucket Sort | 19 |
| 2º | Selection Sort | 18 |
| 3º | Comb Sort | 22 |

### Vetor Ordenado
| Posição | Algoritmo | Trocas |
|---------|-----------|--------|
| 1º | Todos (exceto Selection) | 0 |

### Vetor Invertido
| Posição | Algoritmo | Trocas |
|---------|-----------|--------|
| 1º | Selection Sort | 10 |
| 2º | Comb Sort | 18 |
| 3º | Bucket Sort | 74 |

## Ranking: Menos Iterações

### Vetor Aleatório
| Posição | Algoritmo | Iterações |
|---------|-----------|-----------|
| 1º | Bucket Sort | 63 |
| 2º | Comb Sort | 129 |
| 3º | Cocktail Sort | 154 |

### Vetor Ordenado
| Posição | Algoritmo | Iterações |
|---------|-----------|-----------|
| 1º | Bubble Sort (Flag) | 19 |
| 1º | Cocktail Sort | 19 |
| 3º | Gnome Sort | 20 |

### Vetor Invertido
| Posição | Algoritmo | Iterações |
|---------|-----------|-----------|
| 1º | Bucket Sort | 63 |
| 2º | Comb Sort | 129 |
| 3º | Gnome Sort | 400 |

## Melhor Algoritmo por Situação

| Situação | Melhor Algoritmo | Motivo |
|----------|-----------------|---------|
| **Dados Aleatórios** | Bucket Sort | 19 trocas, 63 iterações |
| **Dados Ordenados** | Bubble Sort (Flag) / Cocktail Sort | 0 trocas, 19 iterações |
| **Dados Invertidos** | Selection Sort | Apenas 10 trocas |
| **Menos Iterações (Geral)** | Bucket Sort | Consistente em 63 iterações |
| **Menos Trocas (Geral)** | Selection Sort | Mínimo de trocas em todos os casos |

## Conclusão

- **Bucket Sort**: Melhor desempenho geral em dados aleatórios
- **Comb Sort**: Excelente equilíbrio entre trocas e iterações
- **Selection Sort**: Mínimo de trocas, ideal quando troca é custosa
- **Gnome Sort**: Evitar para dados invertidos (400 iterações)
