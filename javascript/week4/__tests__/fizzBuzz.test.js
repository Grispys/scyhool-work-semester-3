describe('Tests for fizzbuzz', () => {
  test('verify # is divisble by 3 return fizz', () => {
    expect(fizzBuzz(3).toBe("Fizz"))
  })

  test('verify # is divisble by 5 return buzz', () => {
    expect(fizzBuzz(5).toBe("buzz"))
  })

  test('verify # is divisble by 3&5 return fizzbuzz', () => {
    expect(fizzBuzz(15).toBe("Fizzbuzz"))
  })

  test('verify # is divisble by neither return #', () => {
    
  })
  
})
