#!/bin/bash
echo ""
echo "=== INICIO DEL PROGRAMA ==="
echo ""
cd Desktop/Workspace/Workspace-master ;
git add .
Echo "Ponle el titulo al commit"
read commit
git commit -m "$commit"
git push
echo ""
echo "=== PROGRAMA FINALIZADO ==="
