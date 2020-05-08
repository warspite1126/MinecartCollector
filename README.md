# spigot-boilerplate
for IntelliJ IDEA

## 初回起動
### コンフィグの編集
1. `src/main/kotlin`配下のパッケージ名
1. `src/main/resources/plugin.yml`のnameとmain
1. `gradle.properties`内の`package_*`
1. `settings.gradle`内の`rootProject.name`

Gradleタスク"serve"を実行してください。    
dev-serverディレクトリが生成され、その中にeula.txtが生成されます。    
このタスクを初めて実行する際はspigot自体をビルドするため、時間がかかります。    
EULAに同意する場合はeula.txtのfalseをtrueに書き換えて、再度"serve"を実行してください。    

## コンパイル
Gradleタスク"compile"を実行してください。    
`build/libs`配下に生成されます。

## 実行
Gradleタスク"serve"を実行してください。
localhost:25565で実行されます。 

## 注意事項
- デフォルトで地形はFlatになっています
- デフォルトでネザー、エンドは無効化されています

これらはconfigフォルダ内のコンフィグファイルを編集することで任意の設定に変更可能です。
