#!/bin/bash
echo ""
echo "=== INICIO DEL PROGRAMA ==="
echo ""
git add .
Echo "Ponle el titulo al commit"
read commit
git commit -m "$commit"
git push
echo ""
echo "=== PROGRAMA FINALIZADO ==="
