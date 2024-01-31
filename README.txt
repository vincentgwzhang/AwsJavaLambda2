curl --location 'https://byle6yyn3lmdvjdwowgr7yuxye0qrjty.lambda-url.eu-west-3.on.aws' \
--header 'spring.cloud.function.definition: create' \
--header 'Content-Type: application/json' \
--data-raw 'abc@def.com'

此处用到 Function URL, 选择

Auth type: NONE
Configure cross-origin resource sharing (CORS): Enabled


https://byle6yyn3lmdvjdwowgr7yuxye0qrjty.lambda-url.eu-west-3.on.aws 是 Function URL


记得要运行 maven clean package