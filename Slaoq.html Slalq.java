mkdir techsolutions-projeto
cd techsolutions-projeto
git init
echo "<h1>Bem-vindo à TechSolutions</h1>" > index.html
git add index.html
git commit -m "Adiciona página inicial"
echo "<p>Sobre nós</p>" >> index.html
git commit -am "Adiciona seção 'Sobre nós'"

echo "<p>Contato</p>" >> index.html
git commit -am "Adiciona seção 'Contato'"
git checkout -b nova-funcionalidade
echo "<p>Serviços</p>" >> index.html
git commit -am "Adiciona seção 'Serviços'"
git checkout main
git merge nova-funcionalidade
git add index.html
git commit -m "Resolve conflito na seção 'Serviços'"
echo "## Mudanças recentes\n- Adicionada seção 'Serviços'" > README.md
git add README.md
git commit -m "Atualiza README com informações sobre a nova seção 'Serviços'"
