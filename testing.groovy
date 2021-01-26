job('DSL from seed'){
	description("First DSL job")
	
	parameters{
		booleanParam('FLAG', true)
		stringParam('Planet', defaultValue='World', description='this is the world')
		}
	scm{
		github('https://github.com/ganpatirai/starter-web')
	}
	
	triggers{
		scm('H/5 * * * *')
	}
	
	steps{
		shell('npm install')
	}
}
