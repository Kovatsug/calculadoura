# 🧮 Calculadora API

> API para operações matemáticas básicas.

---

## 📌 Estrutura dos Endpoints

| Operação | Método | Endpoint |
|:---:|:---:|:---|
| ➕ **Adição** | `POST` | `/calculadora/somar` |
| ➖ **Subtração** | `POST` | `/calculadora/subtrair` |
| ✖️ **Multiplicação** | `POST` | `/calculadora/multiplicar` |
| ➗ **Divisão** | `POST` | `/calculadora/dividir` |

---

## 📥 Formato da Requisição e Resposta

A API deverá receber um JSON contendo dois números:

```json
{
  "numero1": 10,
  "numero2": 5
}
```

Exemplo no cmd:
```
curl -X POST -H "Content-Type: application/json" -d "{\"numero1\":10, \"numero2\":5}" http://localhost:8080/calculadora/somar
